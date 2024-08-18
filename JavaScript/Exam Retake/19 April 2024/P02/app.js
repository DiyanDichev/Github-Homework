window.addEventListener("load", solve);

function solve() {
  let formElement = document.querySelector("form");
  let ageElement = document.getElementById("age");
  let typeElement = document.getElementById("type");
  let genderElement = document.getElementById("gender");

  let addButton = document.getElementById("adopt-btn");
  addButton.addEventListener("click", onAdd);

  function onAdd(e) {
    e.preventDefault()
    if (
        ageElement.value == "" ||
        typeElement.value == "" ||
        genderElement.value == ""
    ) {
      return;
    }
    let taskList = document.getElementById("adoption-info");
    let doneList = document.getElementById("adopted-list");

    let taskLiElement = document.createElement("li");
    let buttonDiv = document.createElement("div");
    buttonDiv.setAttribute("class", "buttons")
    let taskArticleElement = document.createElement("article");

    let ageP = document.createElement("p");
    ageP.textContent = `Age:${ageElement.value}`;
    let name = ageElement.value;


    let petP = document.createElement("p");
    petP.textContent = `Pet:${typeElement.value}`;
    let phone = typeElement.value;

    let genderP = document.createElement("p");
    genderP.textContent = `Gender:${genderElement.value}`;
    let gender = genderElement.value;

    taskArticleElement.appendChild(petP);
    taskArticleElement.appendChild(genderP);
    taskArticleElement.appendChild(ageP);


    let editBtn = document.createElement("button");
    editBtn.setAttribute("class", "edit-btn")
    editBtn.addEventListener("click", edit);
    editBtn.textContent = "Edit"

    let doneBtn = document.createElement("button");
    doneBtn.setAttribute("class", "done-btn")
    doneBtn.addEventListener("click", onDone);
    doneBtn.textContent = "Done"
    buttonDiv.appendChild(editBtn);
    buttonDiv.appendChild(doneBtn);

    taskLiElement.appendChild(taskArticleElement);
    taskLiElement.appendChild(buttonDiv);



    taskList.appendChild(taskLiElement);
    formElement.reset();

    function edit() {
      ageElement.value = name;
      typeElement.value = phone;
      genderElement.value = gender;

      taskList.removeChild(taskLiElement);
    }
    function onDone() {
      let taskDoneLiElement = document.createElement("li");
      let deleteBtn = document.createElement("button");
      deleteBtn.setAttribute("class", "clear-btn")
      deleteBtn.addEventListener("click", onDelete);
      deleteBtn.textContent = "Clear"
      taskDoneLiElement.appendChild(taskArticleElement);
      taskDoneLiElement.appendChild(deleteBtn);
      doneList.appendChild(taskDoneLiElement);
      taskList.removeChild(taskLiElement);


      function onDelete() {
        doneList.removeChild(taskDoneLiElement);

      }
    }

  }
}
  