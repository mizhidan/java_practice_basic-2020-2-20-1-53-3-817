package com.thoughtworks;

import java.util.Collection;
import java.util.LinkedHashMap;

public class App {

  public static void main(String[] args) {
    Student ZhangSan = new Student("3","张三");
    Student LiSi = new Student("4","李四");
    Student WangWu = new Student("5","王五");
    Student ZhaoLiu = new Student("6","赵六");
    Student QianQi = new Student("7","钱七");
    MemoryRepository<Student> repo = new MemoryRepository<>();
    repo.save("3",ZhangSan);
    repo.save("4",LiSi);
    repo.save("5",WangWu);
    repo.save("6",ZhaoLiu);
    repo.save("7",QianQi);

    System.out.println(repo.get("3").toString());
    repo.delete("4");
    Student FengWu = new Student("5", "冯五");
    repo.update("5",FengWu);
    RepositoryUtil.printList(repo);
  }
}
