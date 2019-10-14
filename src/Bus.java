public class Bus {
    public static int vacantSeats=4;
    
    public void book(int seats){
        
        if(vacantSeats>=seats){
            System.out.println("Booking Available For "+seats);
            System.out.println("Total Seats Booked  :" +seats);
            vacantSeats=vacantSeats-seats;
            System.out.println("Available Seats Now : "+vacantSeats);
        }else{
            System.out.println("Cant Book ");
            System.out.println("Only "+vacantSeats+" Available");
            System.out.println("Requirement is of "+seats+" Seats");
                
        }
        
        
    }
}
