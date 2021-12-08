public class Exhibition1 extends Event {
    Integer noOfStalls;



    public Exhibition1() {
        super();

    }

    public Exhibition1(String name, String detail, String ownerName,Integer noOfStalls) {
        super(name, detail, ownerName);
        this.noOfStalls=noOfStalls;
    }

    public Integer getNoOfStalls() {
        return noOfStalls;
    }

    public void setNoOfStalls(Integer noOfStalls) {
        this.noOfStalls = noOfStalls;
    }

    public Double projectedRevenue(){
        return (double) (noOfStalls*1000);

    }


}