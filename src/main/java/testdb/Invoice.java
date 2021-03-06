package testdb;

import java.sql.Date;

public class Invoice
{
    long id;
    Date date;
    String description;
    double value;
    byte paid;

    public Invoice(long id,Date date, String description, double value, byte paid)
    {
        this.id = id;
        this.date = date;
        this.description = description;
        this.value = value;
        this.paid = paid;
    }


    public long getId() {
        return id;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public double getValue()
    {
        return value;
    }

    public void setValue(double value)
    {
        this.value = value;
    }

    public byte getPaid()
    {
        return paid;
    }

    public void setPaid(byte paid)
    {
        this.paid = paid;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "date=" + date +
                ", description='" + description + '\'' +
                ", value=" + value +
                ", paid=" + paid +
                '}';
    }
}
