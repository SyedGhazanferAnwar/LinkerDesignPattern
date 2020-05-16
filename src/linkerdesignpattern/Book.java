package linkerdesignpattern;
/** 
  * @desc - The Book class.
  * @author Salman Arshad, Syed Ghazanfer Anwar and Asim Iqbal
*/
class Book{
    private int  id;
    private String Name;
    private boolean IsAvailable;
    private float Price;
    private String Author;
    private String Iban;
    
    Book(){
        
    }
    Book(int _id,String _name, boolean _isAvailable, float _price,String _iban,String _author){
        id=_id;
        Name = _name;
        IsAvailable=_isAvailable;
        Price=_price;
        Author = _author;
        Iban = _iban;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public boolean IsAvailable() {
        return IsAvailable;
    }

    public void setIsAvailable(boolean IsAvailable) {
        this.IsAvailable = IsAvailable;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getIban() {
        return Iban;
    }

    public void setIban(String Iban) {
        this.Iban = Iban;
    }

    @Override
    public String toString() {
        return "Book{" + "Name=" + Name + ", Author=" + Author + '}';
    }
}

