package Demo06;

public class DemoMain {

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("艾希");

        hero.setSkill(new SkillImpl()); //创建实现类对象 biu
        hero.attack();

        System.out.println("========================");

        Skill skill = new Skill() {     //匿名内部类 pia
            @Override
            public void use() {
                System.out.println("piapiapia");
            }
        };
        hero.setSkill(skill);
        hero.attack();

        System.out.println("========================");

        hero.setSkill(new Skill() {  //匿名内部类和匿名对象
            @Override
            public void use() {
                System.out.println("tututututu");
            }
        });
        hero.attack();
    }
}
