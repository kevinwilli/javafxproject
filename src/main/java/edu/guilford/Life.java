package edu.guilford;

public class Life {
    
    //attributes
    private String name;
    private String group;
//private int age;
    private String Job;
   // private int health;

    //constructor
    public Life(String name, String group,String Job) {
        this.name = name;
        this.group = group;
        //this.age = age;
        this.Job = Job;
        //this.health = health;
    }

    //getters and setters

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    // public int getAge() {
    //     return age;
    // }

    public String getJob() {
        return Job;
    }


    // public int getHealth() {
    //     return health;
    // }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    
    // public void setAge(int age) {
    //     this.age = age;
    // }

    public void setJob(String Job) {
        this.Job = Job;
    }

    // public void setHealth(int health) {
    //     this.health = health;
    // }

    //toString method

    @Override

    public String toString() {
        return "Life{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                // ", age=" + age +
                ", Job='" + Job + '\'' +
                // ", health=" + health +
                '}';
    }


}
