class DeliveryGuy
{
public static void deliver(String item)
{
System.out.println("running deliver in DeliveryGuy class");
System.out.println("**********");
DeliveryVehicle.deliver(item, "rajajinagar");
}
}