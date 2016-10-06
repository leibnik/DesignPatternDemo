package prototype.example11;

/**
 * Created by leibnik on 16-10-6.
 */
public class Address {
    public String city;
    public String district;
    public String street;

    public Address(String aCity, String aDistrict, String aStreet){
        city = aCity;
        district = aDistrict;
        street = aStreet;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
