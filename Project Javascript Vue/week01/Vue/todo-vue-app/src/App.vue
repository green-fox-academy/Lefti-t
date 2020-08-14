<template>
  <div id="app">
    <img id="logo" alt=" logo" src="./assets/doit.png">
    <p> <a href="https://www.youtube.com/watch?v=ZXsQAXx_ao0">→ Motivation to do your ToDo's ←</a></p>
    <Todo v-bind:todos="todos"/>
   
  </div>
</template>

<script>
import Todo from './components/Todo.vue'

export default {
  name: 'App',
  components: {

    Todo
  },
  data() {
    return {
      todos: [
        {
          id: 1,
          title: "Todo 1",
          project: "Project A",
          done: false,
        },
        {
          id: 2,
          title: "Todo 2",
          project: "Project B",
          done: true,
        },
         {
          id: 3,
          title: "Todo 3",
          project: "Project B",
          done: false,
        }
      ]
    }
}
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
#logo{
  height: 350px;
  }
a{
  text-decoration: none;

}
  
</style>
