<template>
  <div v-if="editing.edit === false" class="todo-item">
    <h3>{{todo.title}}</h3>
    <h6>{{todo.project}}</h6>
    <button id="edit" v-on:click="editing.edit = true">✎</button>
    <button id="delete" v-on:click="deleteItem(todo)">🗑</button>
    <div v-if="todo.done === true" class="done">
      <button v-on:click="todo.done = false">
        <span>Completed</span>
      </button>
    </div>
    <div v-else class="pending">
      <button v-on:click="todo.done = true">
        <span>Pending</span>
      </button>
    </div>
  </div>
  <div v-else class="edit-item">
    <form id="edit-form" @submit.prevent="editItem">
      <p>
        <label id="input-label-title" for="input-field">Title :</label>
        <input id="input-field-title" v-model="todoEdited.title" type="text" name="title" required />
      </p>
      <p>
        <label id="input-label-project" for="input-field">Project :</label>
        <input
          id="input-field-project"
          v-model="todoEdited.project"
          type="text"
          name="project"
          required
        />
      </p>
      <button class="pending">
        <span>Submit changes</span>
      </button>
    </form>
  </div>
</template>

<script>
export default {
  name: "TodoItem",
  props: ["todo"],
  methods: {
    deleteItem: function () {
      this.$emit("itemDeletion", this.todo);
    },
    editItem: function () {
      this.$emit("editing", this.todoEdited);
      this.todo.title = this.todoEdited.title;
      this.todo.project = this.todoEdited.project;
    

      this.editing.edit = false;
    },
  },
  data() {
    return {
      todoEdited: { ...this.todo },
      editing: {
        edit: false,
      },
    };
  },
};
</script>

<style scoped>
.todo-item {
  position: relative;
}

.edit-item {
  position: relative;
}

h3 {
  text-align: left;
  margin-left: 15px;
  font-family: "Lucida Sans", "Lucida Sans Regular", "Lucida Grande",
    "Lucida Sans Unicode", Geneva, Verdana, sans-serif;
}

h6 {
  text-align: left;
  margin-left: 15px;
  margin-top: -10px;
  color: grey;
}
button {
  border: none;
  background: none;
  font-family: "Lucida Sans", "Lucida Sans Regular", "Lucida Grande",
    "Lucida Sans Unicode", Geneva, Verdana, sans-serif;
  font-size: 20px;
  color: black;
  transition: all 0.5s;
  cursor: pointer;
}
button:focus {
  outline: 0;
}
.done {
  width: 100%;
  height: 30px;
  background: linear-gradient(white, lightblue 99%);
  color: black;
  position: absolute;
  bottom: 0;
  font-family: "Lucida Sans", "Lucida Sans Regular", "Lucida Grande",
    "Lucida Sans Unicode", Geneva, Verdana, sans-serif;
  border-bottom-right-radius: 8px;
  border-bottom-left-radius: 8px;
  border-top: 1px solid black;
}

.pending {
  width: 100%;
  height: 30px;
  background: linear-gradient(white, lightgray 99%);
  color: black;
  position: absolute;
  bottom: 0;
  font-family: "Lucida Sans", "Lucida Sans Regular", "Lucida Grande",
    "Lucida Sans Unicode", Geneva, Verdana, sans-serif;
  border-bottom-left-radius: 8px;
  border-bottom-right-radius: 8px;
  border-top: 1px solid black;
  left: 0;
}

.pending:hover span {
  padding-right: 25px;
}
.pending:hover span:after {
  opacity: 1;
  right: 0;
}
.pending span {
  cursor: pointer;
  display: inline-block;
  position: relative;
  transition: 0.5s;
}
.done:hover span {
  padding-right: 25px;
}
.done:hover span:after {
  opacity: 1;
  right: 0;
}
.done span {
  cursor: pointer;
  display: inline-block;
  position: relative;
  transition: 0.5s;
}
#edit {
  color: green;
  position: absolute;
  right: 45px;
  font-size: 25px;
  bottom: 25px;
}

#delete {
  color: green;
  position: absolute;
  right: 15px;
  margin-left: 15px;
  font-size: 25px;
  font-weight: bold;
  bottom: 25px;
}

#input-label-title {
  font-family: "Lucida Sans", "Lucida Sans Regular", "Lucida Grande",
    "Lucida Sans Unicode", Geneva, Verdana, sans-serif;
  font-weight: bold;
  position: absolute;
  left: 25px;
  top: 20px;
}
#input-field-title {
  position: absolute;
  top: 15px;
  right: 15px;
  width: 60%;
  height: 30px;
  border: 1px solid black;
  background: none;
  border-radius: 5px;
}
#input-label-project {
  font-family: "Lucida Sans", "Lucida Sans Regular", "Lucida Grande",
    "Lucida Sans Unicode", Geneva, Verdana, sans-serif;
  font-weight: bold;
  margin-bottom: 0px;
  justify-content: left;
  position: absolute;
  left: 25px;
  bottom: 45px;
}
#input-field-project {
  position: absolute;
  right: 15px;
  width: 60%;
  height: 30px;
  border: none;
  bottom: 45px;
  border: 1px solid black;
  background: none;
  border-radius: 5px;
}
</style>