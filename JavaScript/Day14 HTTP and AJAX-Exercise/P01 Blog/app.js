function attachEvents() {
    const baseURL = 'http://localhost:3030/jsonstore/blog/';

    const loadPostButton = document.getElementById('btnLoadPosts');
    const viewButton = document.getElementById('btnViewPost');
    const postSelect = document.getElementById('posts');
    const postTitle = document.getElementById('post-title');
    const postBody = document.getElementById('post-body');
    const postComment = document.getElementById('post-comments');

    let allPost = {};

    loadPostButton.addEventListener('click', async () => {
        postSelect.innerText = '';

        const response = await fetch(baseURL + 'posts');
        allPost = await response.json();

        for (const [postId, postObj] of Object.entries(allPost)) {
            const option = document.createElement('option');

            option.value = postId;
            option.textContent = postObj.title;
            postSelect.appendChild(option);
        }

    });

    viewButton.addEventListener('click', async () => {
        const postId = postSelect.value;

        postBody.textContent = allPost[postId].body;
        postTitle.textContent = allPost[postId].title;

        const response = await fetch(baseURL + 'comments');
        const commentsInfo = await  response.json();

        const filteredComments = Object.values(commentsInfo).filter(e=> e.postId === postId);
        filteredComments.forEach(comment => {
            const  li = document.createElement('li');
            li.id = comment.id;
            li.textContent = comment.text;
            postComment.appendChild(li);
        });

    });


}

attachEvents();