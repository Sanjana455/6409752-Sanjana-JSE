import React, { useState } from 'react';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';
import { books } from './data';

function App() {
  const [view, setView] = useState('books');

  return (
    <div>
      <h1>Blogger App</h1>

      <button onClick={() => setView('books')}>Show Books</button>
      <button onClick={() => setView('blog')}>Show Blog</button>
      <button onClick={() => setView('course')}>Show Course</button>

      {view === 'books' && (
        <div className="st2">
          <h1>Book Details</h1>
          <BookDetails books={books} />
        </div>
      )}

      {view === 'blog' ? (
        <div className="v1">
          <h1>Blog Details</h1>
          <BlogDetails />
        </div>
      ) : null}

      {view === 'course' && (
        <div className="mystyle1">
          <h1>Course Details</h1>
          <CourseDetails />
        </div>
      )}
    </div>
  );
}

export default App;
