public class Programmer extends Employee {

    private String language;

    public Programmer(String name, String lastname, int id, String language) {
        super(name, lastname, id);
        this.language = language;
    }

    public void formatIt(String operatingSystem){
        System.out.println(getName() +"  " + operatingSystem + " sistemini güncelledi");
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Yazılım mühendisinin yetkin olduğu diller : " + language);
    }
}
