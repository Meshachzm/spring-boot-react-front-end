import axios from 'axios';
import React, { useEffect, useState } from 'react'
import '../App.css'


const Products = () => {

    const [loading, setLoading] =useState(false);
    const [data, setData] = useState([]);

    useEffect(()=>{

        setLoading(true);

   axios(
      {
       method: "GET",
       url:"https://www.fakestoreapi.com/products"
      }
    )
        .then(response=> {
            console.log(response.data)
            setData(response.data);
        }).catch(e=> console.log(e))
         .finally(setLoading(false));
    }, []);
        


  return (
    <div className='products-container'>

        {loading && (
          <div>
          {""}
          <h1>loading...</h1>
          </div>
          )}


        {data.map((product)=> (
          <div key={product.id} className="card">
            {
              console.log(product.image + product.id)
            }
          <div><img src={product.image} alt="#" /></div>
          <div className='card-description'>

              <h6>{`Price: ${product.price}`}</h6>
              <h6>{`Category: ${product.category}`}</h6>
          </div>
          </div>
        ))}
    </div>
  )
}

export default Products