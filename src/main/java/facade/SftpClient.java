package facade;

public class SftpClient {
    private FTP ftp;
    private Reader reader;
    private Writer writer;

    public SftpClient(FTP ftp, Reader reader, Writer writer){
        this.ftp = ftp;
        this.writer = writer;
        this.reader = reader;
    }

    public SftpClient(String host,int port, String path, String fileName){
        this.ftp = new FTP(host,port,path);
        this.writer = new Writer(fileName);
        this.reader = new Reader(fileName);
    }

    public void connect(){
        ftp.connect();
        ftp.moveDirectory();
        writer.fileConnect();
        reader.fileConnect();
    }

    public void disConnect(){
        reader.fileDisconnect();
        writer.fileDisConnect();
        ftp.disConnect();
    }

    public void write(){
        writer.write();
    }

    public void read(){
        reader.fileRead();
    }
}
