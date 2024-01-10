public class EncapSiswa {
    private String nama, address;
    private int age;

    public int getAge(){
        return age;
    }
    public String getNama(){
        return nama;
    }
    public String getAddress(){
        return address;
    }
    public void setAge(int newAge){
        this.age = newAge;
    }
    public void setName(String newNama){
        this.nama = newNama;
    }
    public void setAddress(String newAddress){
        this.address = newAddress;
    }
}
