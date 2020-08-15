<template>
    <form id="add-form"  @submit.prevent="createItem" >
      <p id="newTask">Add a task</p>
      <p>
        <label id="input-label-title" for="title">Title :</label>
        <input id="input-field-title" v-model="todo.title" name="title" type="text" required />
      </p>
      <p>
        <label id="input-label-project" for="project">Project :</label>
        <input id="input-field-project" v-model="todo.project" name="project" type="text"  required />
      </p>
      <button class="pending">
        <span>Create</span>
      </button>
     
    </form>
</template>

<script>

export default {
    data: function () {
    return {
      todo:{
        title: "",
        project: "",
        done: false,
      }
    }
  },
  methods: {
    createItem: function () {
        this.$emit("createTodo",this.todo)
         this.todo = {
          title: "",
          project: "",
          done: false,
        }
        },
  }
}
</script>

<style scoped>
#add-form{
    position: relative;
     margin-left: auto;
  margin-right: auto;
  height: 150px;
  width: 350px;
  border: 2px solid black;
  background: linear-gradient(white, lightblue 99%);
  border-radius: 10px;
  margin-top: 25px;
  margin-bottom: 10px;
  box-shadow: 0px 0px 10px 1px grey;
  }

#newTask{
     font-family: "Lucida Sans", "Lucida Sans Regular", "Lucida Grande",
    "Lucida Sans Unicode", Geneva, Verdana, sans-serif;
  font-weight: bold;
  position: absolute;
  left: 25px;
  top: -10px;
}
  #input-label-title {
  font-family: "Lucida Sans", "Lucida Sans Regular", "Lucida Grande",
    "Lucida Sans Unicode", Geneva, Verdana, sans-serif;
  font-weight: bold;
  position: absolute;
  left: 25px;
  top: 40px;
}
#input-field-title {
  position: absolute;
  top: 35px;
  right: 15px;
  width: 60%;
  height: 25px;
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
  bottom: 40px;
}
#input-field-project {
  position: absolute;
  right: 15px;
  width: 60%;
  height: 25px;
  border: none;
  bottom: 40px;
   border: 1px solid black;
  background: none;
  border-radius: 5px;
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
</style>