<template>
  <div class="home">

    <div id="title">
      <h2>Search Country</h2>
    </div>

    <!--input text and search button-->
    <div id="searchBar">
      <el-input v-model="input" placeholder="Enter keyword to search for country" clearable/>
      <el-button type="primary" id="submit" @click="search">Search</el-button>
    </div>

    <!--Table to display data-->
    <div id="table">
      <el-table :data="tableData" stripe empty-text="No Country Found" style="width: 100%">
        <el-table-column prop="name" label="Country"/>
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
import axios from "axios";

export default {
  name: 'HomeView',
  components: {},
  data(){
    return{
      input:'',
      tableData:[]
    }
  },
  methods:{
    search(){

      //use axios to generate http request
      axios({
        method:"get",
        url:"http://localhost:9090/country",
        params:{keyword:this.input}
      }).then(result=>{
        console.log(result)
        console.log(result.data)
        //we only want the data part of this json data
        this.tableData = result.data.data
      })

    }
  },
  //mounted function is called when page is loaded
  //pass down empty string which returns all countries
  mounted()
  {
    this.search()
  }
}
</script>
