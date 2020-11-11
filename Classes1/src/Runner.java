import by.gsu.epamlab.BusinessTrip;

public class Runner {
    public static void main(String args[]) {
        BusinessTrip[] businessTrips = {
                new BusinessTrip ("Sidorovich",1234,12),
                new BusinessTrip("Sakovich", 123, 93),
                null,
                new BusinessTrip("Sergeev", 98, 102),
                new BusinessTrip("Zhylinsky", 31, 35),
                new BusinessTrip()
        };
        BusinessTrip tripMaxExpenses = businessTrips[0];
        for (BusinessTrip businessTrip: businessTrips) {
            if(businessTrip != null) {
                businessTrip.Show();
                if (businessTrip.getTotal() > tripMaxExpenses.getTotal()) {
                    tripMaxExpenses = businessTrip;
                }
            }
        }
        System.out.println(tripMaxExpenses);

        businessTrips[businessTrips.length - 1].setExpenses(345);

        System.out.println( "\n"  + "Duration = " + (businessTrips[0].getDays() + businessTrips[3].getDays()) + "\n" );

        for(BusinessTrip businessTrip : businessTrips) {
            System.out.println(businessTrip);
        }
    }
}
