import com.github.sardine.DavResource;
import com.github.sardine.Sardine;
import com.github.sardine.SardineFactory;

import java.io.IOException;
import java.util.List;

public class App {

    public static void main(String[] args) {
        try {
            Sardine sardine = SardineFactory.begin("Admin", "xcW8cZXUYf");
            List<DavResource> resources = sardine.list("https://disk.webonline.pro/remote.php/dav/files/Admin/");
            for (DavResource res : resources) {
                // здесь из res можно вытащить всю информацию, которая присылается на запрос
                System.out.print(res.getHref() + ", " + res.getModified() + ", " + res.getEtag() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
