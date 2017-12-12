package test1;

import java.util.Date;

/**
 * @author 徐浩然
 * @version Period, 2017-12-12
 */
public final class Period
{
    private final Date start;
    private final Date end;

    public Period(Date start, Date end){
        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());
        if (start.compareTo(end) > 0)
        {
            throw new IllegalArgumentException(start + "after" + end);
        }
    }

    public Date getEnd()
    {
        return new Date(end.getTime());
    }

    public Date getStart()
    {
        return new Date(start.getTime());
    }
}
