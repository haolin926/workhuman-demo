<template>
  <div>
    <router-view/>
  </div>
</template>



<script>
import HomeView from "@/views/HomeView.vue";

export default {
  name: "App",
  components: {
    HomeView
  }
}
</script>
