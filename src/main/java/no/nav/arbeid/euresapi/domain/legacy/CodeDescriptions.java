package no.nav.arbeid.euresapi.domain.legacy;

public class CodeDescriptions {

  private String salaryCurrencyDescription;

  private String salaryPeriodDescription;

  private String salaryTaxationDescription;

  public CodeDescriptions() {
  }

  public CodeDescriptions(
      final String salaryCurrencyDescription,
      final String salaryPeriodDescription,
      final String salaryTaxationDescription
  ) {
    this.salaryCurrencyDescription = salaryCurrencyDescription;
    this.salaryPeriodDescription = salaryPeriodDescription;
    this.salaryTaxationDescription = salaryTaxationDescription;
  }

  public String getSalaryCurrencyDescription() {
    return salaryCurrencyDescription;
  }

  public void setSalaryCurrencyDescription(String salaryCurrencyDescription) {
    this.salaryCurrencyDescription = salaryCurrencyDescription;
  }

  public String getSalaryPeriodDescription() {
    return salaryPeriodDescription;
  }

  public void setSalaryPeriodDescription(String salaryPeriodDescription) {
    this.salaryPeriodDescription = salaryPeriodDescription;
  }

  public String getSalaryTaxationDescription() {
    return salaryTaxationDescription;
  }

  public void setSalaryTaxationDescription(String salaryTaxationDescription) {
    this.salaryTaxationDescription = salaryTaxationDescription;
  }

  @Override
  public String toString() {
    return "CodeDescriptions{" +
            ", salaryCurrencyDescription='" + salaryCurrencyDescription + '\'' +
            ", salaryPeriodDescription='" + salaryPeriodDescription + '\'' +
            ", salaryTaxationDescription='" + salaryTaxationDescription + '\'' +
            '}';
  }
}