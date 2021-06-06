import java.util.*;
import java.util.Date;

public class History {
    private  int numberOfVisits;
    private  int review_id;
    private  Event[] eventToReview;
    //private Date dateInHistory;

    public History(int numberOfVisits, int review_id)
    {
        eventToReview = new Event[30];
        for (int i=0; i<29;i++)
            eventToReview[i]=null;

        this.numberOfVisits = numberOfVisits;
        this.review_id = review_id;
    }

    public int getNumberOfVisits()
    {
        return numberOfVisits;
    }

    public int getReview_id()
    {
        return review_id;
    }


}
