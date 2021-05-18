public class CombinedTable
{
    private SingleTable t1, t2;

    public CombinedTable(SingleTable t1 , SingleTable t2)
    {
        this.t1 = t1;
        this.t2 = t2;
    }

    public boolean canSeat(int people)
    {
        int seats = t1.getNumSeats() + t2.getNumSeats() -2;
        return seats >= people;
    }

    public double getDesirability()
    {
        double averageView = (t1.getViewQuality() + t2.getViewQuality())/2;

        if(t1.getHeight() == t2.getHeight())
        return averageView;
        else
        return averageView -10;
    }
}