package customer;

import lombok.ToString;

@ToString
public class BasicCustomer implements Customer {

    private String name,phonenumber,address;

    public BasicCustomer(String name, String phonenumber, String address)
    {
        this.setName(name);
        this.setPhonenumber(phonenumber);
        this.setAddress(address);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        if(name == null)
            throw new RuntimeException("Név megadása kötelező!");
        this.name = name;
    }

    @Override
    public String getPhonenumber() {
        return phonenumber;
    }

    @Override
    public void setPhonenumber(String phonenumber) {
        if(phonenumber == null)
            throw new RuntimeException("Telefonszám megadása kötelező!");
        this.phonenumber = phonenumber;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        if(address == null)
            throw new RuntimeException("Szállítási cím megadása kötelező!");
        this.address = address;
    }


}
