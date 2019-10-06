function submitForm() {

  var givenCondition = document.getElementById("condition-field").value;
  var givenGender = document.getElementById("gender-field").value;
  var givenAge = document.getElementById("age-field").value;
  var givenLocation = document.getElementById("location-field").value;

  window.localStorage.setItem("givenCondition", givenCondition);
  window.localStorage.setItem("givenGender", givenGender);
  window.localStorage.setItem("givenAge", givenAge);
  window.localStorage.setItem("givenLocation", givenLocation);

}
