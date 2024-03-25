package Demo06;

public class Hero {

    private String name;    //英雄姓名
    private Skill skill;    //英雄法术技能

    public Hero() {
    }

    public Hero(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public void attack() {  //攻击方法
        System.out.println("我叫" + name + "开始释放技能" );
        skill.use();  //调用接口中的成员方法
        System.out.println("技能释放完成");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}
