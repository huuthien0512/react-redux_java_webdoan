export const FETCH_PRODUCTS_SUCCESS = "FETCH_PRODUCTS_SUCCESS";

const fetchProductsSuccess = products => ({
  type: FETCH_PRODUCTS_SUCCESS,
  payload: products
});


export const fetchProducts = (products) => async (dispatch) => {
  try {
    //const { data } = await axios.get(`/api/products?keyword=${keyword}&pageNumber=${pageNumber}`);
    console.log(data);
    dispatch(fetchProductsSuccess(products));
  } catch (error) {
    dispatch({
      type: PRODUCT_LIST_FAIL,
      payload: error.response && error.response.data.msg,
    });
  }
};

// fetch products
// export const fetchProducts = products => {
//   return dispatch => {
//     dispatch(fetchProductsSuccess(products));
//   };
// };
