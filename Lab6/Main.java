class Main {
  public static void main(String[] args) {
    MyMap<String, Integer> creditHours = new MyHashMap<>();
    creditHours.put("IT-1025", 3);
    creditHours.put("IT-1050", 3);
    creditHours.put("IT-1150", 3);
    creditHours.put("IT-2310", 3);
    creditHours.put("IT-2320", 4);
    creditHours.put("IT-2351", 4);
    creditHours.put("IT-2650", 4);
    creditHours.put("IT-2660", 4);
    creditHours.put("IT-2030", 4);

    System.out.println("Map contains IT-1025? " + creditHours.containsKey("IT-1025"));
    System.out.println("Map contains IT-2110? " + creditHours.containsKey("IT-2110"));

    // Clean way to print the map content
    System.out.println("Printing map content:");
    for (MyMap.Entry<String, Integer> entry: creditHours.entrySet())
      System.out.println(entry);

    creditHours.remove("IT-2030");
    creditHours.remove("IT-1150");

    // values() returns a Set so we only see the unique values
    System.out.println("All values in the map:");
    for (Integer value: creditHours.values())
      System.out.println(value);

  }
}