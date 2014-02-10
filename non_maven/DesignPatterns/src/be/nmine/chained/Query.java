package be.nmine.chained;

public class Query
{
    protected String queryString = "";

    public Query select(String what) 
    {
        queryString += "SELECT " + what;
        return this;
    }

    public Query from(String from)
    {
        queryString += " FROM " + from;
        return this;
    }

    public Query where(String where)
    {
        queryString += " WHERE " + where;
        return this;
    }

    public void Invoke()
    {
//        ... database invocation bla bla
        System.out.println(queryString);
    }
    public static void main(String[] args) {
		new Query().select("*").from("table").where("a=b").Invoke();
	}
}
