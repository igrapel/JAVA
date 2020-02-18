
package frq2013q1;
import java.util.ArrayList;

public class DownloadInfo {
    int downloaded;
    String title;
    public DownloadInfo(String title)
    {
        this.title = title;
        downloaded = 0;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public void incrementTimesDownloaded()
    {
        downloaded++;
    }
    
}
