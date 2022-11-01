public class Manager extends Employee{

    private int personResponsible;

    public Manager(String name, String lastname, int id, int personResponsible) {
        super(name, lastname, id);
        this.personResponsible = personResponsible;
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Proje Yöneticisini sorumlu olduğu kişi sayısı : " + personResponsible);

    }

    public void makeARaise(int amount){
        System.out.println(getName() + "Çalışana "+ amount + " kadar zam yapıldı ");

    }




}
