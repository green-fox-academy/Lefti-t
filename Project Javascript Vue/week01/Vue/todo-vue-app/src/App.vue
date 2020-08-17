<template>
  <div id="app">
    <img id="logo" alt=" logo" src="./assets/doit.png" />
    <p>
      <a href="https://www.youtube.com/watch?v=ZXsQAXx_ao0">→ Motivation to do your ToDo's ←</a>
    </p>
    <CreateTodo v-on:createTodo="createTodo($event)" />
    <Todo v-bind:todos="todos" />
  </div>
</template>

<script>
import Todo from "./components/Todo.vue";
import CreateTodo from "./components/CreateTodo.vue";

export default {
  name: "App",

  components: {
    Todo,
    CreateTodo,
  },
  data() {
    return {
      todos: [
        {
          title: "Todo 1",
          project: "Project A",
          done: false,
        },
        {
          title: "Todo 2",
          project: "Project B",
          done: true,
        },
        {
          title: "Todo 3",
          project: "Project B",
          done: false,
        },
      ],
    };
  },
  methods: {
    createTodo: function (todo) {
      this.todos.push(todo);
    },
    
  },
};
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;

}
#logo {
  margin-top: 10px;
  height: 350px;

}
a {
  text-decoration: none;
}
</style>
