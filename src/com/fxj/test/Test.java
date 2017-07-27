package com.fxj.test;

/**
 * Created by Administrator on 2017/7/27.
 */

        import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.List;
        import java.util.Map;


public class Test {

/**
    public static  List<HashMap<String, String>> init(){

        List<HashMap<String, String>> maps=new ArrayList<HashMap<String,String>>();
        String[] tap=new String[]{"姓名","工号","性别","年龄","所在部门","职务"};
        String[] worker1=new String[]{"张铭","S0001","男","29","人事部","经理"};
        String[] worker2=new String[]{"李艾艾", "S0002", "21","女", "人事部", "助理"};
        List<String[]> workers=new ArrayList<String[]>();
        workers.add(worker1);
        workers.add(worker2);

        for(int i=0;i<workers.size();i++){
            HashMap<String, String> map=new HashMap<String, String>();
            for(int j=0;j<tap.length;j++)
            {
                map.put(tap[j], workers.get(i)[j]);
            }
            maps.add(map);
        }
        return maps;
    }

    public static void mapShow(Map<String,String> map){
        System.out.println("姓名:"+map.get("姓名")+"\n工号:"+map.get("工号")+"\n性别:"+map.get("性别")+"\n年龄:"
                +map.get("年龄")+"\n职务:"+map.get("职务")
                +"\n=================================");
    }
 */

    public static List<Staff> init2(){
        List<Staff> workers= new ArrayList<>();
        Staff staff1=new Staff("张铭", "29", "S0001","男", "人事部", "经理");
        Staff staff2=new Staff("李艾艾", "21", "S0002","女", "人事部", "助理");
        Staff staff3=new Staff("孙超","29","S004","男","人事部","职员");
        Staff staff4=new Staff("张美美","26","S005","女","市场部","职员");
        Staff staff5=new Staff("蓝迪","37","S006","男","市场部","经理");
        Staff staff6=new Staff("米莉","24","S007","女","市场部","职员");
        workers.add(staff1);
        workers.add(staff2);
        workers.add(staff3);
        workers.add(staff4);
        workers.add(staff5);
        workers.add(staff6);
        return workers;
    }

    public static void main(String[] args) {
        List<HashMap<String, String>> maps=new ArrayList<HashMap<String,String>>();
        List<Staff> workers= new ArrayList<>();

/**
        maps=init();
        for (Map<String,String> map : maps) {
            mapShow(map);
        }
*/

        workers=init2();
        for (Staff staff : workers) {
            staff.show();
        }
        System.out.println("人事部总共有3名员工");
        System.out.println("市场部总共有3名员工");
    }
}
