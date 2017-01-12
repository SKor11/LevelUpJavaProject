import spock.lang.Specification

/**
 * Created by java on 16.12.2016.
 */
class AListSpockTest extends Specification {

  def 'check is add element correct'(){
      given: 'initialize AList'
      AList list = new  AList();

      when: 'try to add one element'
      list.add(num)

      then: 'Check list size'
      list.size() == 1

      where:
        num << [0, 5, 7, 256]
  }

}
