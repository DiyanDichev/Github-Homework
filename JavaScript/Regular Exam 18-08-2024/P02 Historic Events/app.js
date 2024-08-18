window.addEventListener("load", solve);

function solve() {
    let formElement = document.querySelector("form");
    let nameElement = document.getElementById("name");
    let dateElement = document.getElementById("time");
    let descriptionElement = document.getElementById("description");
    let publishBtn = document.getElementById("add-btn");

    publishBtn.addEventListener("click", publish);

    function publish() {
        if (nameElement.value === "" || dateElement.value === "" || descriptionElement.value === "") {
            return;
        }

        let previewList = document.getElementById("preview-list");
        let archiveList = document.getElementById("archive-list");

        let taskLiElement = document.createElement("li");
        let taskArticleElement = document.createElement("article");

        let titleHeadingElement = document.createElement("p");
        titleHeadingElement.textContent = `${nameElement.value}`;
        let taskTitle = nameElement.value;

        let categoryPElement = document.createElement("p");
        categoryPElement.textContent = `${dateElement.value}`;
        let taskCategory = dateElement.value;

        let contentPElement = document.createElement("p");
        contentPElement.textContent = `${descriptionElement.value}`;
        let taskContent = descriptionElement.value;

        taskArticleElement.appendChild(titleHeadingElement);
        taskArticleElement.appendChild(categoryPElement);
        taskArticleElement.appendChild(contentPElement);

        let buttonDiv = document.createElement("div");
        buttonDiv.classList.add("buttons");

        let editBtn = document.createElement("button");
        editBtn.classList.add("edit-btn");
        editBtn.textContent = "Edit";
        editBtn.addEventListener("click", () => edit(taskLiElement, taskTitle, taskCategory, taskContent));

        let postBtn = document.createElement("button");
        postBtn.classList.add("next-btn");
        postBtn.textContent = "Next";
        postBtn.addEventListener("click", () => post(taskLiElement, buttonDiv));

        taskLiElement.appendChild(taskArticleElement);
        taskLiElement.appendChild(buttonDiv);
        buttonDiv.appendChild(editBtn);
        buttonDiv.appendChild(postBtn);

        previewList.appendChild(taskLiElement);
        formElement.reset();

        publishBtn.disabled = true;
    }

    function edit(taskLiElement, taskTitle, taskCategory, taskContent) {
        nameElement.value = taskTitle;
        dateElement.value = taskCategory;
        descriptionElement.value = taskContent;

        let previewList = document.getElementById("preview-list");
        previewList.removeChild(taskLiElement);

        publishBtn.disabled = false;
    }

    function post(taskLiElement, buttonDiv) {
        let archiveList = document.getElementById("archive-list");
        taskLiElement.removeChild(buttonDiv);

        const archiveButton = document.createElement('button');
        archiveButton.setAttribute('class', 'archive-btn');
        archiveButton.textContent = 'Archive';

        archiveButton.addEventListener('click', () => {
            archiveList.removeChild(taskLiElement);
            publishBtn.disabled = false;
        });

        taskLiElement.appendChild(archiveButton);
        archiveList.appendChild(taskLiElement);
        publishBtn.disabled = true;
    }
}