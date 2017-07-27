package com.fxj.test;

/**
 * Created by Administrator on 2017/7/21.
 */


/**
 * public class Test {
 * <p>
 * private String data;
 * <p>
 * public Test(String name) {
 * System.out.println("小狗的名字是 ： " + name);
 * }
 * <p>
 * public static void main(String[] args) {
 * Test te = new Test("tommy");
 * }
 * }
 */


public class Staff extends Test {


    public String name;
    public String num;
    public String age;
    public String sex;
    public String depa;
    public String post;

    public Staff(String name, String age, String num, String sex, String post,
                 String depa) {
        super();
        this.name = name;
        this.age = age;
        this.num = num;
        this.sex = sex;
        this.post = post;
        this.depa = depa;
    }

    @Override
    public String toString() {
        return "staff [name=" + name + ", age=" + age + ", num=" + num
                + ", sex=" + sex + ", post=" + post + ", depa=" + depa + "]";
    }


    public void show() {
        System.out.println("姓名:" + this.name + "\n工号:" + this.num + "\n性别:" + this.sex + "\n年龄:" + this.age + "\n职务:" + this.post + "\n======================");
    }

/**
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getNum() {
        return num;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getPost() {
        return post;
    }
 */
}



/**
    public static void main(String[] args) {
        Staff aa = new Staff();
        aa.setName("张铭");
        aa.setNum("S001");
        aa.setSex("男");
        aa.setAge("29");
        aa.setPost("人事部经理");
        aa.show();
        Staff bb = new Staff();
        bb.setName("李艾爱");
        bb.setNum("S002");
        bb.setSex("女");
        bb.setAge("21");
        bb.setPost("人事部助理");
        bb.show();
        Staff cc = new Staff();
        cc.setName("孙超");
        cc.setNum("S004");
        cc.setSex("男");
        cc.setAge("29");
        cc.setPost("人事部职员");
        cc.show();
        Staff dd = new Staff();
        dd.setName("张美美");
        dd.setNum("S005");
        dd.setSex("女");
        dd.setAge("26");
        dd.setPost("市场部职员");
        dd.show();
        Staff ee = new Staff();
        ee.setName("蓝迪");
        ee.setNum("S006");
        ee.setSex("男");
        ee.setAge("37");
        ee.setPost("市场部经理");
        ee.show();
        Staff ff = new Staff();
        ff.setName("米莉");
        ff.setNum("S007");
        ff.setSex("女");
        ff.setAge("24");
        ff.setPost("市场部职员");
        ff.show();
    }
}
 */