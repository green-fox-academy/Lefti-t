<template>
    <form id="app"  @submit.stop.prevent >
      <p>
        <label id="input-label-title" for="title">Title :</label>
        <input id="input-field-title" v-model="todo.title" type="text" name="title" required />
      </p>
      <p>
        <label id="input-label-project" for="project">Project :</label>
        <input id="input-field-project" v-model="todo.project" type="text" name="project" required />
      </p>
      <button class="pending" v-on:click="createItem">
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
        }
  }
}
</script>

<style scoped>

</style>