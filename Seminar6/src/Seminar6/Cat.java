package Seminar6;

public class Cat{
    private int monthBirth;
    private int yearBirth;
    private String nameCat;
    private CatOwner catOwner;
    private char catMale;

    public Cat(String nameCat, CatOwner catOwner){
        this.nameCat = nameCat;
        this.catOwner = catOwner;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "monthBirth=" + monthBirth +
                ", yearBirth=" + yearBirth +
                ", nameCat='" + nameCat + '\'' +
                ", catOwner=" + catOwner +
                ", catMale=" + catMale +
                '}';
    }

    public void setMonthBirth(int monthBirth) {
        this.monthBirth = monthBirth;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public String getNameCat() {
        return nameCat;
    }

    public void setNameCat(String nameCat) {
        this.nameCat = nameCat;
    }

    public CatOwner getCatOwner() {
        return catOwner;
    }

    public void setCatOwner(CatOwner catOwner) {
        this.catOwner = catOwner;
    }
    public char getCatMale() {
        return catMale;
    }

    public void setCatMale(char catMale) {
        this.catMale = catMale;
    }

    public int getMonthBirth() {
        return monthBirth;
    }

    public  boolean isMale(){
        return this.catMale == 'M';
    }
}

