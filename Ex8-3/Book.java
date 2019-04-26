/*
    CHC-29Mar2019
        Added this class per instruction on Exercise 8-3
        Add getDisplayText method
        Added the nremoved final
*/

public class Book extends Product
{
	private String author;

	public Book()
	{
		super();
		author = "";
		count++;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

	public String getAuthor()
        {
		return author;
	}

        @Override
	public String getDisplayText()
	{
		return super.toString() +
			"Author:      " + author + "\n";
	}
}