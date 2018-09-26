package com.barzinga.restClient.parameter

import com.barzinga.model.Product
import com.barzinga.model.User

/**
 * Created by diego.santos on 12/10/17.
 */
class TransactionParameter(val user: User?, var pin: String, var products: List<Product>)