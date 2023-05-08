package dev.graciano.javafeatures;

public class TextBlock {
  //-text
  public String oldSuperBigMessyQuery() {
    return "SELECT first_name, last_name, age, " +
      "ssn, marital_status, " +
      "income, street_name, " +
      "zip_code, state, city, " +
      "county, country, phone_number " +
      "from client c, address a " +
      "where c.client_id = a.client_id " +
      "and country in ('USA', 'INDIA, 'BRAZIL')";
  }

  //new-text
  public String superCoolTextBlock(){
      return """
        SELECT first_name, last_name, age,
              ssn, marital_status,
              income, street_name,
              zip_code, state, city,
              county, country, phone_number
              from client c, address a
              where c.client_id = a.client_id
              and country in ('USA', 'INDIA, 'BRAZIL')
        """;
    }
}
