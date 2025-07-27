import React from "react";
import Post from "./Post";

class Posts extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            posts: [],
            error: null
        };
    }

    loadPosts() {
        fetch("https://jsonplaceholder.typicode.com/posts")
            .then(response => response.json())
            .then(data => {
                const posts = data.map(item => new Post(item.id, item.title, item.body));
                this.setState({ posts });
            })
            .catch(error => {
                this.setState({ error });
            });
    }

    componentDidMount() {
        this.loadPosts();
    }

    componentDidCatch(error, info) {
        alert("An error occurred: " + error);
        this.setState({ error });
    }

    render() {
        if (this.state.error) {
            return <div>Error: {this.state.error.toString()}</div>;
        }
        return (
            <div className="posts-center">
                <h1>Posts</h1>
                {this.state.posts.map(post => (
                    <div key={post.id}>
                        <h2>{post.title}</h2>
                        <p>{post.body}</p>
                    </div>
                ))}
            </div>
        );
    }
}

export default Posts;
