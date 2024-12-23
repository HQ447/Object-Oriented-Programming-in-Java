public class PieceWorkers extends Employee{

    private double PieceWorkerSalary;
    private int items;
    private int ItemPrice;

    public PieceWorkers(String f_Name, String l_Name, String SSN, int items, int itemPrice,double PieceWorkerSalary ) {
        super(f_Name, l_Name, SSN);

        this.items = items;
        this.ItemPrice = itemPrice;
        this.PieceWorkerSalary = TotalSalary();

    }

    public double getPieceWorkerSalary() {
        return PieceWorkerSalary;
    }

    public void setPieceWorkerSalary(double pieceWorkerSalary) {
       this.PieceWorkerSalary = PieceWorkerSalary;
    }

    public int getItems() {
        return items;
    }

    public void setItems(int items) {
        this.items = items;
    }

    public int getItemPrice() {
        return ItemPrice;
    }

    public void setItemPrice(int itemPrice) {
        ItemPrice = itemPrice;
    }
    double TotalSalary(){
        return PieceWorkerSalary =ItemPrice*items;

    }

    @Override
    public String toString() {
        return "PieceWorkers{" +

                "," + items +" pieces have been produced"+
                ", ItemPrice=" + ItemPrice +
                ", PieceWorker Total Salary=" + PieceWorkerSalary +
                '}';
    }
}
