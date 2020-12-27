
import java.io.FileOutputStream;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfWriter;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;

public class SimplePDFTable
{
    public SimplePDFTable() throws Exception
    {
        Document document = new Document();
        PdfWriter.getInstance(document,
                new FileOutputStream("C:/Users/aman.raj/Desktop/files/pdf/abc.pdf"));
        document.open();
        PdfPTable table = new PdfPTable(2); // Code 1
        // Code 2
        table.addCell("1");
        table.addCell("2");
        // Code 3
        table.addCell("3");
        table.addCell("4");
        // Code 4
        table.addCell("5");
        table.addCell("6");
        // Code 5
        document.add(table);
        System.out.println(document.toString());
        document.close();
    }

    public static void main(String[] args)
    {
        try
        {
            SimplePDFTable pdfTable = new SimplePDFTable();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}