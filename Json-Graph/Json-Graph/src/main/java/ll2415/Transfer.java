package ll2415;

public class Transfer {

    private String from_stop_id;
    private String to_stop_id;
    //private double min_transfer_time;
    
    public void setfrom_stop_id(String from_stop_id) {
         this.from_stop_id = from_stop_id;
     }
     public String getfrom_stop_id() {
         return from_stop_id;
     }

    public void setto_stop_id(String to_stop_id) {
         this.to_stop_id = to_stop_id;
     }
     public String getto_stop_id() {
         return to_stop_id;
     }

    /*public void setmin_transfer_time(double min_transfer_time) {
         this.min_transfer_time = min_transfer_time;
     }
     public double getmin_transfer_time() {
         return min_transfer_time;
     }*/

}