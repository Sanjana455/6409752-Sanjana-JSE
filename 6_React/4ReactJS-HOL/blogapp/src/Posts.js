import React, { Component } from "react";

class Posts extends Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
    };
  }

  loadPosts() {
    fetch("https://jsonplaceholder.typicode.com/posts")
      .then((response) => {
        if (!response.ok) {
          throw new Error("Failed to fetch posts");
        }
        return response.json();
      })
      .then((data) => {
        this.setState({ posts: data });
      })
      .catch((error) => {
        console.error("Error fetching posts:", error);
        alert("Failed to load posts.");
      });
  }

  componentDidMount() {
    this.loadPosts();
  }

  componentDidCatch(error, info) {
    console.error("Caught an error:", error, info);
    alert("An error occurred while rendering the posts.");
  }

  render() {
    return (
      <div>
        <h1>Posts</h1>
        {this.state.posts.map((post) => (
          <div key={post.id}>
            <h3>{post.title}</h3>
            <p>{post.body}</p>
          </div>
        ))}
      </div>
    );
  }
}

export default Posts;
