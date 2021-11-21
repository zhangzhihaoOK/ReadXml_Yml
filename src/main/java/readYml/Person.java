package readYml;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
//确保可以在controller中执行
@Component("person")
//将yml中的数据映射到Person类中
@ConfigurationProperties(prefix = "person")
@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String name = "李四";
    private Integer age = 77;
    private String gender = "女";
    private Integer salary;
    private Boolean boss;
    private Map<String, Object> maps;
    private List<Object> lists;
    private Dog dog;

//    public Person() {
//    }


//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Integer getAge() {
//        return age;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    public Integer getSalary() {
//        return salary;
//    }
//
//    public void setSalary(Integer salary) {
//        this.salary = salary;
//    }
//
//    public Boolean getBoss() {
//        return boss;
//    }
//
//    public void setBoss(Boolean boss) {
//        this.boss = boss;
//    }

//    public Person(String name, Integer age, String gender, Integer salary, Boolean boss, Map<String, Object> maps, List<Object> lists, Dog dog) {
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//        this.salary = salary;
//        this.boss = boss;
//        this.maps = maps;
//        this.lists = lists;
//        this.dog = dog;
//    }

//    public Map<String, Object> getMaps() {
//        return maps;
//    }
//
//    public void setMaps(Map<String, Object> maps) {
//        this.maps = maps;
//    }
//
//    public List<Object> getLists() {
//        return lists;
//    }
//
//    public void setLists(List<Object> lists) {
//        this.lists = lists;
//    }
//
//    public Dog getDog() {
//        return dog;
//    }
//
//    public void setDog(Dog dog) {
//        this.dog = dog;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", gender='" + gender + '\'' +
//                ", salary=" + salary +
//                ", boss=" + boss +
//                ", maps=" + maps +
//                ", list=" + lists +
//                ", dog=" + dog +
//                '}';
//    }
}
