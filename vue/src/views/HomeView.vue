<template>
  <div class="home">
    <div id="title">
      <h2>Search Country</h2>
    </div>
    <div id="searchBar">
      <el-input v-model="input" placeholder="Enter keyword to search for country" clearable/>
      <el-button type="primary" id="submit" @click="search">Search</el-button>
    </div>

    <div id="table">
      <el-table :data="tableData" stripe style="width: 100%">
        <el-table-column prop="country" label="Country"/>
      </el-table>
    </div>
  </div>

</template>

<style>
.home{
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: flex-start;
  flex-wrap: wrap;
}
#searchBar{
  margin-top: 40px;
  width:400px;
  align-self: center;
  display: flex;
}
#title
{
  align-self: center;
}
#submit{
  margin-left: 10px;
}
#table{
  margin-top:30px;
  align-self: center;
  width:400px;
}
</style>

<script>


export default {
  name: 'HomeView',
  components: {},
  data(){
    return{
      input:'',
      tableData:[
      ]
    }
  },
  methods:{
    search(){

    }
  }
}
</script>
