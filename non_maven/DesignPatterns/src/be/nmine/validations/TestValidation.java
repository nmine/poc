package be.nmine.validations;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

public class TestValidation {

  public static void main(String[] args) {

    PersonneBean personne = new PersonneBean(null, null, new GregorianCalendar(
        2065, Calendar.JANUARY, 18).getTime());
    
    ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    Validator validator = factory.getValidator();

    Set<ConstraintViolation<PersonneBean>> constraintViolations = 
      validator.validate(personne);

    if (constraintViolations.size() > 0 ) {
      System.out.println("Impossible de valider les donnees du bean : ");
      for (ConstraintViolation<PersonneBean> contraintes : constraintViolations) {
        System.out.println(contraintes.getRootBeanClass().getSimpleName()+
           "." + contraintes.getPropertyPath() + " " + contraintes.getMessage());
      }
    } else {
      System.out.println("Les donnees du bean sont valides");
    }
  }
}