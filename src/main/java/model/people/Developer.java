package model.people;

/**
 * Created by IPREMGI on 13/04/2017.
 */
public class Developer extends Person {

    private Company company;

    public Developer(Company company){
        setRange(0);
        setCapacitySize(1);
        this.company = company;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getType() {
            return "Developer - " + company.name();
    }

    public String getCompanyName(){
        return company.name();
    }


}
